package com.democassandra.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
@NoArgsConstructor
@Data
public class Tutorial {
    @PrimaryKey
    private int id;

    private String title;
    private String description;
    private boolean published;

    public Tutorial(int id, String title, String description, boolean published) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.published = published;
    }
}
