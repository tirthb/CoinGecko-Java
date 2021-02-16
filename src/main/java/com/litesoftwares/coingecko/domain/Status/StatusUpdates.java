package com.litesoftwares.coingecko.domain.Status;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusUpdates {
    @JsonProperty("status_updates")
    private List<Update> updates;

	public List<Update> getUpdates() {
		return updates;
	}

	public void setUpdates(List<Update> updates) {
		this.updates = updates;
	}

}