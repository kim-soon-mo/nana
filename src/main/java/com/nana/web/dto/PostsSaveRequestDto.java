package com.nana.web.dto;

import com.nana.web.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by wmp-2013112501 on 2018. 3. 7..
 */
@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    public Posts toEntity(){ return Posts.builder() .title(title) .content(content) .author(author) .build(); }


}
