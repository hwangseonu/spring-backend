package me.mocha.backend.post.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NewPostRequest {

    @NotBlank
    @NotNull
    private String title;

    @NotBlank
    @NotNull
    private String content;

}
