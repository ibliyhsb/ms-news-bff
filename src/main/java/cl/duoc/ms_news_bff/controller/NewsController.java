package cl.duoc.ms_news_bff.controller;

import cl.duoc.ms_news_bff.model.dto.NewsArticleDto;
import cl.duoc.ms_news_bff.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bff/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping
    public List<NewsArticleDto> getAll() {
        return newsService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<NewsArticleDto> getById(@PathVariable Long id) {
        NewsArticleDto article = newsService.getById(id);
        if (article == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(article);
    }

    @PostMapping
    public ResponseEntity<NewsArticleDto> create(@RequestBody NewsArticleDto article) {
        return ResponseEntity.ok(newsService.create(article));
    }

    @PutMapping("/{id}")
    public ResponseEntity<NewsArticleDto> update(@PathVariable Long id, @RequestBody NewsArticleDto article) {
        return ResponseEntity.ok(newsService.update(id, article));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        newsService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
