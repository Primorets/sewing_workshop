package com.sw.sewing_workshop.textile;

import com.sw.sewing_workshop.textile.dto.TextileDto;

import java.util.List;

public interface TextileService {

    TextileDto getTextileById(Long id);

    List<TextileDto> getAllTextiles();

    TextileDto createTextile(TextileDto textileDto);

    TextileDto updateTextile(TextileDto textile, Long id);

    void deleteTextileById(Long id);
}
