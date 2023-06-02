package simple.simplewebservice.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import simple.simplewebservice.service.PostsService;
import simple.simplewebservice.web.dto.PostsResponseDto;
import simple.simplewebservice.web.dto.PostsSaveRequestDto;
import simple.simplewebservice.web.dto.PostsUpdateRequestDto;

@RequiredArgsConstructor // 생성자 주입
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts") // savePosts
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}") // updatePosts
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}") // 조회
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

    @DeleteMapping("/api/v1/posts/{id}") // deletePosts
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}
