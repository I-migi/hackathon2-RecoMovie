package com.hackathonteam2.recomovie.cinema.dto;

import com.hackathonteam2.recomovie.cinema.entity.Cinema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CinemaDto {

	private String brand;

	private String region;

	private String name;

	public Cinema toEntity() {
		return Cinema.builder()
			.brand(this.brand)
			.region(this.region)
			.name(this.name)
			.build();
	}

	public static CinemaDto of(Cinema cinema) {
		return CinemaDto.builder()
			.brand(cinema.getBrand())
			.region(cinema.getRegion())
			.name(cinema.getName())
			.build();
	}
}
