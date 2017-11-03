export class Ingredient{

    ingredientName: string;
    amountPerPerson: number;
    unit: string;

    constructor(name:string, amount:number,unit:string){
        this.ingredientName = name;
        this.amountPerPerson = amount;
        this.unit = unit;
    }


}