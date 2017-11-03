import {Ingredient} from './../../ingredients/models/Ingredient' 
import {PreparationStep} from './PreparationStep' 

export class Recipe{
    name: String;
    ingredients :Array<Ingredient>;
    preparation: Map<number,string>;
    preparationTime: number;
    imageUrl: string;

    constructor(){
        this.ingredients = new Array();
        this.imageUrl = '';
        this.name = '';
        this.preparation = new Map();    
    }
}