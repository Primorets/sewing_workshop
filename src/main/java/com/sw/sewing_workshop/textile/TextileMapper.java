package com.sw.sewing_workshop.textile;

import com.sw.sewing_workshop.textile.dto.TextileDto;


public class TextileMapper {
    public static TextileDto toTextileDto(Textile textile) {
        return new TextileDto(textile.getId(),
                textile.getName(),
                textile.getColor(),
                textile.getStatus(),
                textile.getLength(),
                textile.getWidth(),
                textile.getDelivery_time());
    }

    public static Textile toTextile(TextileDto textileDto) {
        return new Textile(textileDto.getId(),
                textileDto.getName(),
                textileDto.getColor(),
                textileDto.getStatus(),
                textileDto.getLength(),
                textileDto.getWidth(),
                textileDto.getDelivery_time());
    }

}
