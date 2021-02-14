var person = {
    firstname : 'Sakurazaki',
    lastName : 'Arisu',
    year : 2001,
    fullname : function(){
        return(this.firstname + " "+ this.lastName)
    },
    age : function(){
        return 2020 - this.year
    }
}

console.log('Object dari person\t: ')
//manggil method
console.log(`Name\t: ${person.fullname()}`)
console.log(`Tahun\t: ${person.year}`)
console.log(`Umur\t: ${person.age()}`)