package com.sw.sewing_workshop.textile;

import com.sw.sewing_workshop.exception.DuplicateEmailException;
import com.sw.sewing_workshop.exception.TextileNotFoundException;
import com.sw.sewing_workshop.textile.dto.TextileDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class TextileServiceImpl implements TextileService {

    @Autowired
    private TextileRepository textileRepository;
    
    @Override
    public TextileDto getTextileById(Long id) {
        return TextileMapper.toTextileDto(textileRepository.findById(id).orElseThrow(()
                -> new TextileNotFoundException("Пользователь не был зарегестрирован.")));

    }

    @Override
    public List<TextileDto> getAllTextiles() {
        return textileRepository.findAll().stream().map(TextileMapper::toTextileDto).collect(toList());
    }
    @Transactional
    @Override
    public TextileDto createTextile(TextileDto textileDto) {
        try {
            return TextileMapper.toTextileDto(textileRepository.save(TextileMapper.toTextile(textileDto)));
        } catch (DuplicateEmailException duplicateEmailException) {
            throw new DuplicateEmailException("Email уже зарегестрирован");
        }
    }

    @Transactional
    @Override
    public TextileDto updateTextile(TextileDto textile, Long id) {
        textile.setId(id);
        Textile textile1 = textileRepository.findById(textile.getId()).orElseThrow(()
                -> new TextileNotFoundException("Пользователь не был зарегестрирован."));

        return TextileMapper.toTextileDto(textileRepository.save(TextileMapper.toTextile(textile)));

    }
    @Override
    public void deleteTextileById(Long id) {
        textileRepository.deleteById(id);
    }

}
