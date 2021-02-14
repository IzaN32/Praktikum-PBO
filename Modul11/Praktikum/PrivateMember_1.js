function Person(){
  var name = 'Chara'
  var age = 20


this.setName = function(newName){
  name = newName
}

this.getName = function(){
  name = newName
}

this.setAge = function(newAge){
  age = newAge
}

this.getAge = function(){
  age = newAge
}

this.growOlder = function(){
  age++
}
}

var person new Person('Mona')

console.log("Nama person \t: ", person.name);
console.log("Nama person \t: ", person.getAge());

person.setAge(100)
console.log('Umur person yang diganti\t: ', person.getAge());

person.growOlder()
console.log('Umur person yang ditambah\t: ', person.getAge());