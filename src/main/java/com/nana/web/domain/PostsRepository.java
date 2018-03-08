package com.nana.web.domain;

import com.nana.web.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wmp-2013112501 on 2018. 3. 7..
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
