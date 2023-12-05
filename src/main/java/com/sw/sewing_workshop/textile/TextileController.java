package com.sw.sewing_workshop.textile;

import com.sw.sewing_workshop.Create;
import com.sw.sewing_workshop.Update;

import com.sw.sewing_workshop.textile.dto.TextileDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/textile")
public class TextileController {

    @Autowired
    private TextileService textileService;

    @GetMapping("/{id}")
    public TextileDto getTextileById(@PathVariable Long id) {
        log.info("Получен запрос на получение ткани по ID: " + id);
        return textileService.getTextileById(id);
    }

    @GetMapping
    public List<TextileDto> getAllTextiles() {
        log.info("Получен запрос на получение всех тканей.");
        return textileService.getAllTextiles();
    }

    @ResponseBody
    @PostMapping
    public TextileDto createTextile(@RequestBody @Validated(Create.class) TextileDto TextileDto) {
        log.info("Добавлена ткань: " + TextileDto);
        return textileService.createTextile(TextileDto);
    }

    @ResponseBody
    @PatchMapping("/{id}")
    public TextileDto updateTextile(@RequestBody @Validated(Update.class) TextileDto Textile, @PathVariable Long id) {
        log.info("Получен запрос на изменение данных о ткани с ID: " + id);
        return textileService.updateTextile(Textile, id);
    }

    @DeleteMapping("/{id}")
    public void deleteTextileById(@PathVariable Long id) {
        log.info("Получен запрос на удаление ткани: " + id);
        textileService.deleteTextileById(id);
    }
    
}
