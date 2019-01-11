The program uses linked hash map, which has O(1) time complexity for search

LinkedHashMap comes with the removeEldestEntry method to enable removal of the eldest entry.

Steps:
1. The first loop is to get the SIZE of the cache for the first time.
2. Second pass is the main body of the caching algorithm:
	a.if the input length is not given properly, it'll throw "ERROR"
 	b.if proper input is given, it'll set the values and get accordingly
3.To come out of the body, "EXIT" will stop the execution 