package simple.simplewebservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import simple.simplewebservice.domain.posts.PostsRepository;
import simple.simplewebservice.web.dto.PostsSaveRequestDto;

@RequiredArgsConstructor // 생성자 주입
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
