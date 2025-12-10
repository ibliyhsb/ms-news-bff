package cl.duoc.ms_news_bff.service;

import cl.duoc.ms_news_bff.client.NewsBsClient;
import cl.duoc.ms_news_bff.model.dto.NewsArticleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsBsClient newsBsClient;

    public List<NewsArticleDto> getAll() {
        return newsBsClient.getAll();
    }

    public NewsArticleDto getById(Long id) {
        return newsBsClient.getById(id);
    }

    public NewsArticleDto create(NewsArticleDto article) {
        return newsBsClient.create(article);
    }

    public NewsArticleDto update(Long id, NewsArticleDto article) {
        return newsBsClient.update(id, article);
    }

    public void delete(Long id) {
        newsBsClient.delete(id);
    }
}
