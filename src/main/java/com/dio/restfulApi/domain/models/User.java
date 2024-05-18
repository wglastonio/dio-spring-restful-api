package com.dio.restfulApi.domain.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clientName;

    @OneToOne(cascade = CascadeType.ALL)
    private Account accountNumber;

    @OneToOne(cascade = CascadeType.ALL)
    private Card cardNumber;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public Account getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(Account accountNumber) {
        this.accountNumber = accountNumber;
    }
    public List<Feature> getFeatures() {
        return features;
    }
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
    public Card getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(Card cardNumber) {
        this.cardNumber = cardNumber;
    }
    public List<News> getNews() {
        return news;
    }
    public void setNews(List<News> news) {
        this.news = news;
    }

    
}
