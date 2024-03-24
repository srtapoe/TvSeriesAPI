package br.com.studies.tvseriesapi.controller;

import br.com.studies.tvseriesapi.entity.TvSeries;
import br.com.studies.tvseriesapi.repository.TvSeriesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/series")
class TvSeriesController {
    private final TvSeriesRepository repository;

    public TvSeriesController(TvSeriesRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<TvSeries> getAllSeries() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TvSeries> getSeriesById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping
    public TvSeries addSeries(@RequestBody TvSeries series) {
        return repository.save(series);
    }

    @PutMapping("/{id}")
    public TvSeries updateSeries(@PathVariable Long id, @RequestBody TvSeries updatedSeries) {
        updatedSeries.setId(id);
        return repository.save(updatedSeries);
    }

    @DeleteMapping("/{id}")
    public void deleteSeries(@PathVariable Long id) {
        repository.deleteById(id);
    }
}