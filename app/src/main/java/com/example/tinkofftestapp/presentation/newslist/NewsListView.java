package com.example.tinkofftestapp.presentation.newslist;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;
import com.example.tinkofftestapp.data.model.NewsTitle;
import com.example.tinkofftestapp.util.AddToEndSingleByTagStateStrategy;

import java.util.List;

@StateStrategyType(AddToEndSingleStrategy.class)
public interface NewsListView extends MvpView {

    void setLoading(boolean isLoading);

    void setRefreshing(boolean isRefreshing);

    void setItems(List<NewsTitle> newsList);

    @StateStrategyType(value = AddToEndSingleByTagStateStrategy.class, tag = "fatalError")
    void showFatalError(String message);

    @StateStrategyType(value = AddToEndSingleByTagStateStrategy.class, tag = "fatalError")
    void hideFatalError();
}
