
var jumlah = 12;
var hasil = [0, 1];

for(var i=0; i<jumlah-2; i++) {
    hasil.push(hasil[i] + hasil[i+1]);
}
console.log(hasil);