package org.example.reservavideojuegos.model;

import javafx.scene.chart.PieChart;

import java.time.LocalDate;
import java.util.Date;

public class Game {

    private String title;
    private LocalDate releaseDate;

    public Game(String title, LocalDate releaseDate) {
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
