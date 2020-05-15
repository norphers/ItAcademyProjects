console.log("Step 1");

var city1;
var city2;
var city3;
var city4;
var city5;
var city6;

city1 = window. prompt("Write a city name: ");
city2 = window. prompt("Write a city name: ");
city3 = window. prompt("Write a city name: ");
city4 = window. prompt("Write a city name: ");
city5 = window. prompt("Write a city name: ");
city6 = window. prompt("Write a city name: ");

console.log(city1 + ", " + city2 + ", " +  city3 + ", " +  city4 + ", " +  city5 + " and " +  city6 + ".");

console.log("Step 2");

var arrayCities = [city1,city2,city3,city4,city5,city6];
arrayCities.sort();
console.log(arrayCities);

console.log("Step 3");

var arrayModCities=[];

for (i=0; i<arrayCities.length;i++) {
    arrayCities[i] = arrayCities[i].replace('a','4'); 
    arrayModCities.push(arrayCities[i]);
}

arrayModCities.sort();
console.log(arrayModCities);


console.log("Step 4");


charCity1 = city1.split('');
    for(i=city1.length()-1; i>=0; i--) {
        console.log(charCity1[i]);
    }

charCity2 = city2.split('');
    for(i=city2.length()-1; i>=0; i--) {
        console.log(charCity2[i]);
    }

charCity3 = city3.split('');
    for(i=city3.length()-1; i>=0; i--) {
        console.log(charCity3[i]);
    }

charCity4 = city4.split('');
    for(i=city4.length()-1; i>=0; i--) {
        console.log(charCity4[i]);
    }

charCity5 = city5.split('');
    for(i=city5.length()-1; i>=0; i--) {
        console.log(charCity5[i]);
    }

charCity6 = city6.split('');
    for(i=city6.length()-1; i>=0; i--) {
        console.log(charCity6[i]);
    }
