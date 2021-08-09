package org.jcg.springboot.redis.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PayMentEvent implements Serializable{
	@Valid
	@JsonProperty
	@NotNull(message = "paymentType can`t be null")
	@Pattern(regexp="^[a-zA-Z ]+$", message = "paymentType must be a string")
	String paymentType;
	@Valid
	@JsonProperty
    BigDecimal value;
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
