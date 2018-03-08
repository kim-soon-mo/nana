package com.nana.web.controllers;

import com.nana.web.domain.PostsRepository;
import com.nana.web.dto.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wmp-2013112501 on 2018. 3. 7..
 */

@RestController
@AllArgsConstructor
public class WebRestController {

    private static Logger logger = LogManager.getLogger(WebRestController.class);

    private PostsRepository postsRepository;

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }


}
