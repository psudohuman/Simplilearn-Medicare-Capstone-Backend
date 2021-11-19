package com.Medicare.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Item> itemsInCart;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Item> getItemsInCart() {
		return itemsInCart;
	}

	public void setItemsInCart(List<Item> itemsInCart) {
		this.itemsInCart = itemsInCart;
	}

	public Cart() {
		super();
	}

	public Cart(int id, List<Item> itemsInCart) {
		super();
		this.id = id;
		this.itemsInCart = itemsInCart;
	}

}
