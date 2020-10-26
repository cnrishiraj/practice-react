//1 // module.exports=`this is a exported file text`

//2// module.exports.hello=function() {return `hello`}
	// module.exports.bye=function() {return `bye`}

//3
// foo=function(){
// 	console.log(`fool`);
// }

//4
//module.exports = function () {
      //console.log('bar!');
    //}

//5
// exports.fiz=function(){
// 	console.log('fiz!');
// }

// //6
// var Buz = function () {};
//     Buz.prototype.log = function () {
//       console.log('buz!');
//     };
//     module.exports = new Buz();

// //7 named object
// var Baz = function () {};
//     Baz.prototype.log = function () {
//       console.log('baz!');
//     };
// exports.Baz = new Baz();

//8 anonymous object
// var Doo = function () {};
//     Doo.prototype.log = function () {
//         console.log('doo!');
//     }
//     module.exports = Doo;

//9
var Qux = function () {};
    Qux.prototype.log = function () {
      console.log('baz!');
    };
    exports.Qux = Qux;

