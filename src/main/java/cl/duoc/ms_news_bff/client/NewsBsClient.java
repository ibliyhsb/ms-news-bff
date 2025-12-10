package cl.duoc.ms_news_bff.client;

import cl.duoc.ms_news_bff.model.dto.NewsArticleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "newsBsClient", url = "${news.bs.url}")
public interface NewsBsClient {
    @GetMapping("/news")
    List<NewsArticleDto> getAll();

    @GetMapping("/news/{id}")
    NewsArticleDto getById(@PathVariable("id") Long id);

    @PostMapping("/news")
    NewsArticleDto create(@RequestBody NewsArticleDto article);

    @PutMapping("/news/{id}")
    NewsArticleDto update(@PathVariable("id") Long id, @RequestBody NewsArticleDto article);

    @DeleteMapping("/news/{id}")
    void delete(@PathVariable("id") Long id);
}
