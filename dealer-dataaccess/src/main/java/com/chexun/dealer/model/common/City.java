package com.chexun.dealer.model.common;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class City implements Serializable{
    private Long id;
    private String name;
    private Long provinceid;
    private String code;
    private String letter;
    private String shortname;
    private String englishname;
}
