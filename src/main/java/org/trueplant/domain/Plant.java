package org.trueplant.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Plant {

    private String name;
    private Integer id;
    private String description;
    private String origin;
    private String soilType;
    private String hardinessZone;
}
