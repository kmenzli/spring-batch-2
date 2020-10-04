package org.training.spring.model;

import lombok.*;

@Getter @Setter
@ToString
@EqualsAndHashCode
public class Report {
    private String date;
    private String impressions;
    private String clicks;
    private String earning;
}
