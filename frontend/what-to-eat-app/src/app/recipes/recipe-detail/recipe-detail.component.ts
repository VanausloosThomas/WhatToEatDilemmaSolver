import { Component, OnInit } from '@angular/core';
import { Recipe } from '../models/recipe';
import { PreparationStep } from '../models/PreparationStep';
import { Ingredient } from '../../ingredients/models/Ingredient';

@Component({
  selector: 'wte-recipe-detail',
  templateUrl: './recipe-detail.component.html',
  styleUrls: ['./recipe-detail.component.css']
})
export class RecipeDetailComponent implements OnInit {

  recipe: Recipe = new Recipe();
  constructor() { 
    this.recipe.name ='Babi Pangang';
    this.recipe.preparationTime = 30;
    this.recipe.imageUrl = 'http://www.ohmyfoodness.nl/wp-content/uploads/2016/03/babi_pangangfeat.jpg';
    this.recipe.preparation.set(0,'this is step 1');
    this.recipe.ingredients.push(new Ingredient('pork',500,'grams'))
    this.recipe.ingredients.push(new Ingredient('sause',300,'ml'))
    this.recipe.ingredients.push(new Ingredient('pineapple',1,'can'))
  }

  ngOnInit() {
  }

  getImageUrl():string{
    return this.recipe.imageUrl;
  }

}
