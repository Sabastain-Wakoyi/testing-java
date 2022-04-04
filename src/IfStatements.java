public class IfStatements {

    public static void main(String[] args) {
        // if statement; this performs a block of code if it's condition evaluates to be true.

        int age = 5;
        if (age >=60) {
            System.out.println("Ok Boomer");
        }
        else  if(age>=18){
            System.out.println("You are an adult");
        }
        else if(age>=13){
            System.out.println("You are a teenager");
        }
        else if(age == 5){
            System.out.println("You are a kid");
        }
        else {
            System.out.println("You are not an adult");
        }
    }
}



//javascript exe

//
// const cart = ["itemName", "price"]
//  for ( let i = 0; i < cart.length; i++) {
// }
// fetch("cart.json").then(rsp=>rsp.json()).then(cart=> {
//        let total = 0;
//        for(const product of cart) {
//            let itemName = 0
//            let price = 0
//            const productTotal = price * itemName
//            total = total + productTotal
//
//        }
//
//        console.log(total)
//
//  })

//
// fetch("cart.json").then(rsp=>rsp.json()).then(cart=>{
//     for(let item of cart) {
//        // console.log(item)
//
//         cart.forEach(obj => {
//             Object.entries(obj).forEach(([key, value]) => {
//                 console.log(`${key }  ${value}`);
//
//             });
//
//            let itemName = 0
//            let  price = 0
//            let total = itemName * price
//             console.log(total)
//         });
//     }
//
// })


    fetch("cart.json").then(rsp=>rsp.json()).then(cart=>{
        let totalPrice = 0;
        for (i = 0; i < cart.length; ++i) {
        totalPrice = Math.round(totalPrice) + (cart[i].price);
        let tax = .0825
        totalProduce = totalPrice * tax;
        grandTotal = totalPrice + totalProduce



        }
        console.log(totalPrice)
        console.log(totalProduce)
        console.log(grandTotal)
        })

//cart : the array of items in the cart
//cart[i] : the item in the cart at the index i
//cart[i].price : the price of the item in the cart at the index i

// let total = 0;
// for (let i = 0; i < this.state.seatArray.length; i++) {
//     total += total + parseInt(this.state.seatArray[i].price);
// }






        fetch("cart.json").then(rsp=>rsp.json()).then(cart=>{
        var totalPrice = 0;
        for (i = 0; i < cart.length; ++i) {
        totalPrice +=cart[i];

        }
        console.log(totalPrice)
        })

//use this one
// fetch("cart.json").then(rsp=>rsp.json()).then(cart=>{
//     var totalPrice = 0;
//     for (i = 0; i < cart.length; ++i) {
//         totalPrice +=cart[i];
//
//     }
//     console.log(totalPrice)
// })

// end




// fetch('cart.json').then( response => {
//         response.json().then( cart => {
//                 cart.forEach( totalPrice  => {
//
//                         // do something with the username login
//                         console.log(totalPrice);
//                 });
//         });
// });




// fetch("cart.json").then(rsp=>rsp.json()).then(cart=>{
//     for(let item of cart) {
//         console.log(item)
//     }
// })


// fetch("coupons.json").then(rsp=>rsp.json()).then(cart=>{
//     for(let item of cart) {
//         console.log(item)
//     }
// })



// let shoppingCart=(function(){
//     let cart = [];
//
//     function Items(name, price,count, coupon){
//         this.name = name
//         this.price = price
//         this.count = count
//         this.coupon = coupon
//
//     }
//
// function savingCart(){
//         localStorage.SetItem('shoppingCart', JSON.stringify(cart));
// }
//     function loadCart(){
//         cart = JSON.parse(localStorage.getItem('shoppingCart'));
//         if (cart == null){
//             cart = []
//         }
//     }
// loadCart();
//
//     let  object = {};
//
//     object.addItemToCart = function (name, price, count, coupons) {
//         for (let i in cart) {
//             if (cart[i].name === name) {
//                 cart.count += count;
//                 savingCart();
//                 return;
//             }
//         }
//         console.log('addItemToCart:', name, price, count)
//     }
// })
//
//
// let pears = [4];
// pears[0] = "white";
// pears[1] = "black";
// pears[2] = "brown";
// pears[3] = "ripe";
// totalprice = 4 * 3
//  console.log(totalprice)
//
//
// // var shoppingCart = { };
// // shoppingCart.cart = [];
// //
// // shoppingCart.Item = function (name, price, count){
// //  this.name = name
// //  this.price = price
// //  this.count = count
// // }
// //
// // shoppingCart.addItemToCart = function (name, price, count){
// //  for (var i in this.cart){}
// //  if (this.cart[i].name == name){
// //   this.cart[i].count += count;
// //   this.saveCart();
// //   return;
// //  }
// // }
// //
// // console.log("addItemToCart: ", name, price, count);
// // var item = new this.Item(name, price, count);
// // this.cart.push(item)
// // this.saveCart()




