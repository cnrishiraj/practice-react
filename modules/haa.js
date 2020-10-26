//1// var msg=require(`./bar.js`)
//console.log(msg)


//2// var bar=require(`./bar.js`)
// console.log(bar.hello())
// console.log(bar.bye())


// 3 require(`./bar.js`);
// foo();

// 4
// var bar = require('./bar.js');
    //bar();

//5
// var foo=require('./bar.js').fiz;
// foo();

// //6
//     var buz = require('./bar.js');
//     buz.log();

// //7 named object
//  var baz = require('./bar.js').Baz;
//     baz.log();

// //8
// var Doo = require('./bar.js');
//     var doo = new Doo();
//     doo.log();

//9 named prototype
    var Qux = require('./bar.js').Qux;
    var qux = new Qux();
    qux.log();
