package com.Medicare.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemCategory {
	
	@Id
	@GeneratedValue
	private int id;
	private String itemCategoryName;
	public int getId() {
		return id;
	}
	public ItemCategory() {
		super();
	}
	public ItemCategory(int id, String itemCategoryName) {
		super();
		this.id = id;
		this.itemCategoryName = itemCategoryName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemCategoryName() {
		return itemCategoryName;
	}
	public void setItemCategoryName(String itemCategoryName) {
		this.itemCategoryName = itemCategoryName;
	}


}
