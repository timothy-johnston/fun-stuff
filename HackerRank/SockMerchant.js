function sockMerchant(n, ar) {

    var pairs = 0;
    var colorCounts = new Map()

    for (var i = 0; i < n; i ++) {

        if (colorCounts.has(ar[i])) {
            colorCounts.set(ar[i], colorCounts.get(ar[i]) + 1);
        } else {
            colorCounts.set(ar[i], 1);
        }

        console.log(i);

    }

    for (let [k, v] of colorCounts) {
        pairs += Math.floor(v / 2);
    }

    console.log(pairs);

    return pairs;

};