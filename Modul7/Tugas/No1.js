function predikat (nilai){
    if(nilai >85 && nilai <= 100){
        return'A'
    }
    else if (nilai > 75 && nilai <= 84){
        return 'B'
    }
    else if (nilai > 65 && nilai <= 75){
        return 'BC'
    }
    else if (nilai > 55 && nilai <= 64){
    return 'C'
    }
    else if (nilai > 45 && nilai <= 54){
        return 'D'
    }
    else if (nilai > 0 && nilai <= 44){
        return 'E'
    }
}
//function2
function myFunction2(arg1, arg2){
    this.Name = arg1
    this.Nilai = arg2
}
var x = new myFunction2("Budi",((87)))
var hasil = predikat(x.Nilai)
console.log("Masukan nama\t: "+ x.Name)
console.log("Masukan nilai\t: "+ x.Nilai)

console.log(x.Name+ "Kamu mendapatkan predikat " + hasil); 