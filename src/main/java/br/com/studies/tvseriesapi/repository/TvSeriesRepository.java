package br.com.studies.tvseriesapi.repository;

import br.com.studies.tvseriesapi.entity.TvSeries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvSeriesRepository extends JpaRepository<TvSeries, Long> {
}

