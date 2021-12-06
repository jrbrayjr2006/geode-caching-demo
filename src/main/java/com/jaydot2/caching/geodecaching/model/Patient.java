package com.jaydot2.caching.geodecaching.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Data
@Builder
@Region(value = "patient")
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
}
