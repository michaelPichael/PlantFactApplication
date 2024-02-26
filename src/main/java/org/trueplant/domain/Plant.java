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

    public String name;
    public Integer id;
    public String description;
    public String origin;
    public String soilType;
    public String hardinessZone;
}
