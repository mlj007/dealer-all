package com.chexun.dealer.model.common;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Province implements Serializable{
    private Long id;
    private Long regionId;
    private String name;
    private String code;
    private String shortName;
}
