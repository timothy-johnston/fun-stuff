function sockMerchant(n, ar) {
    
    // //Test
    // for (i = 0; i < n -1; i ++) {
    //     console.log("i is " + i);
    //     console.log(n + ar[i]);
    //     console.log("------------");
    // }

    var pairs = 0;
    var colorCounts = new Map()

    //SockMerchant Implementation
    for (i = 0; i < n; i ++) {

        if (colorCounts.has(ar[i])) {
            colorCounts.set(ar[i], colorCounts.get(ar[i]) + 1);
        } else {
            colorCounts.set(ar[i], 1);
        }

        console.log(i);

    }

    console.log(colorCounts);

};