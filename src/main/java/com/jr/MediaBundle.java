package com.jr;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
public class MediaBundle {
    public List<SubmissionBundle> mediaBundleList = new ArrayList<>();

}
