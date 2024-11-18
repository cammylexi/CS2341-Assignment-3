# CS2341-Assignment-3
//Camryn McPhaul- 48876677
### Performance and Scalability Considerations 

For this assignment, I will be implementing the Red-Black Tree. The Red-Black Tree is a self-balancing binary search tree with a time complexity of 2 log n. The insertion process begins with the first product, which becomes the tree's root. As more products are inserted, the tree compares their IDs to determine their correct position.
During the insertion, the tree evaluates whether the new product’s ID is greater or smaller than the current node's ID. This balancing mechanism of the tree automatically adjusts its height by using rotations and recoloring during the insertion to ensure that the tree remains balanced. 
The search operation works similarly, beginning at the tree's root, where the target key ID is compared with the current node’s key. If it matches, the associated value will be returned. If not, it will either go left or right, cut the search in half as the transversal continues until the right key is found or a null pointer is reached. 
Due to its balancing mechanism, it shows a great deal with large datasets. The time complexity for insert and search is O(h), where h is the height of the tree. The height of a Red-Black Tree is always logarithmic with respect to the number of nodes N due to its self-balancing nature. 
The height of a Red-Black Tree is 2 log⁡ N, so for N=10,000, the height is approximately 2×log⁡ 10,000 ≈ 27, which determines the cost of operations like insertion and search, all of which run in O(log⁡ N)  time.

### Output
```

Enter the Product ID to search (or type 'exit' to quit): 59dfb9d35fb1772d0e793a5a174a8e62
Product found! Here are the details:
   - ID: 59dfb9d35fb1772d0e793a5a174a8e62
   - Name: Forum Novelties Women's Flirting with The 50's Polka Dot Cutie
   - Category: "Clothing, Shoes & Jewelry | Costumes & Accessories | Women | Costumes & Cosplay Apparel | Costumes"
   - Price: $9.00 - 39.99

Do you want to search for another product? (Type:[Yes or No])
Yes

Enter the Product ID to search (or type 'exit' to quit): 5a94e346d857072004f8c8383ff6c31c
Product found! Here are the details:
   - ID: 5a94e346d857072004f8c8383ff6c31c
   - Name: Swing Set Stuff Commercial Rubber Belt Seat with SSS Logo Sticker, Red
   - Category: Toys & Games | Arts & Crafts | Stickers
   - Price: $36.74

Do you want to search for another product? (Type:[Yes or No])
Yes

Enter the Product ID to search (or type 'exit' to quit): a67b91efac20e3ef130d4a888964ba91
Product found! Here are the details:
   - ID: a67b91efac20e3ef130d4a888964ba91
   - Name: Girls Fairy Tale Southern Belle White Dress Hat Fancy Halloween Child Costume
   - Category: "Clothing, Shoes & Jewelry | Costumes & Accessories | Women | Costumes & Cosplay Apparel | Costumes"
   - Price: $26.34 - 48.59

Do you want to search for another product? (Type:[Yes or No])
No

Insertion Results: 
Successfully Inserted: A product with ID 123c456a789m0
Insertion Error: A product with ID 82c86a4d24dce5e14303033d7b658b78 already exists in the tree.
```



