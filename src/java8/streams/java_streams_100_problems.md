# 100 Java Streams Problems — Beginner to Expert

A comprehensive problem set covering the full Java Stream API. Problems are grouped by skill level and tagged with the core APIs exercised.

---

## Level 1 · Beginner (Problems 1–20)

> Core operations: `stream()`, `filter()`, `map()`, `forEach()`, `collect()`, `count()`

---

**1. Print all elements**
Given a `List<String>`, print every element using `forEach`.
`Tags:` forEach

---

**2. Count elements**
Count how many strings are in a list using `count()`.
`Tags:` count

---

**3. Filter even numbers**
From a `List<Integer>`, return only even numbers.
`Tags:` filter

---

**4. Convert strings to uppercase**
Map a `List<String>` to a new list where every string is uppercased.
`Tags:` map, collect

---

**5. Filter strings by length**
Return only strings with length greater than 5 from a list.
`Tags:` filter

---

**6. Collect to a list**
Stream an array of integers and collect them into a `List<Integer>`.
`Tags:` Arrays.stream, collect, toList

---

**7. Sum of a list**
Compute the sum of a `List<Integer>` using `mapToInt` and `sum()`.
`Tags:` mapToInt, sum

---

**8. Find the maximum**
Find the maximum integer in a list.
`Tags:` max, Comparator.naturalOrder

---

**9. Find the minimum**
Find the minimum integer in a list.
`Tags:` min

---

**10. Check if any element matches**
Check if any string in a list starts with the letter `"A"`.
`Tags:` anyMatch

---

**11. Check if all elements match**
Verify that all integers in a list are positive.
`Tags:` allMatch

---

**12. Check if no elements match**
Confirm that no string in a list is empty.
`Tags:` noneMatch

---

**13. Get the first element**
Return the first element of a stream wrapped in an `Optional`.
`Tags:` findFirst

---

**14. Remove duplicates**
Remove duplicate integers from a list using `distinct()`.
`Tags:` distinct

---

**15. Sort a list of strings**
Sort a `List<String>` alphabetically using streams.
`Tags:` sorted

---

**16. Sort in reverse order**
Sort a `List<Integer>` in descending order.
`Tags:` sorted, Comparator.reverseOrder

---

**17. Limit a stream**
From an infinite stream of natural numbers, take the first 10.
`Tags:` Stream.iterate, limit

---

**18. Skip elements**
Skip the first 5 elements of a list and return the rest.
`Tags:` skip

---

**19. Convert list of strings to list of lengths**
Map each string to its length.
`Tags:` map, String::length

---

**20. Collect to a set**
Collect a stream of strings (with duplicates) into a `Set<String>`.
`Tags:` collect, Collectors.toSet

---

## Level 2 · Elementary (Problems 21–40)

> Combining operations, method references, primitive streams, basic collectors

---

**21. Average of a list**
Compute the average of a `List<Double>` using `mapToDouble` and `average()`.
`Tags:` mapToDouble, average, OptionalDouble

---

**22. Concatenate strings with a delimiter**
Join all strings in a list into a single string separated by `", "`.
`Tags:` Collectors.joining

---

**23. Filter and count**
Count how many strings in a list have length > 3 and start with a vowel.
`Tags:` filter, count

---

**24. Filter nulls**
Given a list that may contain nulls, return a new list with nulls removed.
`Tags:` filter, Objects::nonNull

---

**25. Map and filter chained**
From a list of employee names, return uppercased names of those longer than 4 characters, sorted.
`Tags:` filter, map, sorted, collect

---

**26. Convert strings to integers**
Parse a `List<String>` of numbers into a `List<Integer>`.
`Tags:` map, Integer::parseInt

---

**27. Sum of squares**
Compute the sum of squares of a list of integers.
`Tags:` mapToInt, map, sum

---

**28. Find any element**
From a parallel stream, return any element satisfying a predicate (non-deterministic).
`Tags:` parallelStream, findAny

---

**29. Build a comma-separated string with prefix and suffix**
Join names as `[Alice, Bob, Charlie]`.
`Tags:` Collectors.joining with prefix/suffix

---

**30. Collect to unmodifiable list**
Collect stream results into an unmodifiable list (Java 10+).
`Tags:` Collectors.toUnmodifiableList

---

**31. Map objects to a field**
From a list of `Person` objects, extract a `List<String>` of names.
`Tags:` map, method reference

---

**32. Sum salaries**
Sum the salary field of a list of `Employee` objects.
`Tags:` mapToDouble, sum

---

**33. Filter by object field**
Return employees whose department is `"Engineering"`.
`Tags:` filter, method reference

---

**34. Count by condition**
Count how many products have a price above 100.
`Tags:` filter, count

---

**35. Generate a stream**
Generate a stream of 10 random doubles between 0 and 1.
`Tags:` Stream.generate, Math::random, limit

---

**36. Range of integers**
Print all integers from 1 to 50 using `IntStream.rangeClosed`.
`Tags:` IntStream.rangeClosed, forEach

---

**37. Fibonacci sequence**
Generate the first 15 Fibonacci numbers using `Stream.iterate`.
`Tags:` Stream.iterate, limit, map

---

**38. Collect to sorted list**
Collect results into a sorted list in one terminal operation.
`Tags:` Collectors.toList, sorted

---

**39. Check list is empty via stream**
Return true if a stream produces no elements after filtering.
`Tags:` count, findAny, noneMatch

---

**40. Map to optional and unwrap**
Map a list of strings to `Optional<Integer>` (parse safely), filter empties, collect values.
`Tags:` map, Optional, filter, flatMap

---

## Level 3 · Intermediate (Problems 41–60)

> `flatMap`, `groupingBy`, `partitioningBy`, `reduce`, `toMap`, `Optional` chains

---

**41. Flatten a list of lists**
Flatten a `List<List<String>>` into a single `List<String>`.
`Tags:` flatMap, Collection::stream

---

**42. Flatten and deduplicate**
Flatten a list of word lists and return distinct words sorted alphabetically.
`Tags:` flatMap, distinct, sorted

---

**43. Group by a property**
Group a list of employees by their department into `Map<String, List<Employee>>`.
`Tags:` Collectors.groupingBy

---

**44. Group and count**
Count the number of employees per department.
`Tags:` Collectors.groupingBy, Collectors.counting

---

**45. Group and sum**
Compute total salary per department.
`Tags:` Collectors.groupingBy, Collectors.summingDouble

---

**46. Group and collect names**
For each department, collect a list of employee names (not full objects).
`Tags:` Collectors.groupingBy, Collectors.mapping, Collectors.toList

---

**47. Partition into two groups**
Partition integers into even and odd.
`Tags:` Collectors.partitioningBy

---

**48. Partition with downstream collector**
Partition students into pass/fail and count each group.
`Tags:` Collectors.partitioningBy, Collectors.counting

---

**49. Build a Map from a list**
Convert a `List<Person>` into a `Map<Integer, String>` (id → name).
`Tags:` Collectors.toMap

---

**50. Handle duplicate keys in toMap**
Build a `Map<String, String>` from a list that has duplicate keys — use a merge function.
`Tags:` Collectors.toMap, merge function

---

**51. Reduce to a product**
Compute the product of all integers in a list using `reduce`.
`Tags:` reduce, identity

---

**52. Reduce to build a string**
Use `reduce` to concatenate strings with a separator (no `joining`).
`Tags:` reduce

---

**53. Reduce to build a frequency map**
Count occurrences of each character in a string using `reduce` or `collect`.
`Tags:` reduce, Map::merge

---

**54. Optional chaining**
Safely get a configuration value: look up a key, parse to int, validate it is > 0, return a default if absent.
`Tags:` Optional.ofNullable, map, filter, orElse

---

**55. flatMap on Optional**
Given a method returning `Optional<String>` and another returning `Optional<Integer>` from a string, chain them safely.
`Tags:` Optional.flatMap

---

**56. Nested groupingBy**
Group transactions first by year, then by category within each year.
`Tags:` Collectors.groupingBy nested

---

**57. Top N per group**
For each department, find the top 3 highest-paid employees.
`Tags:` groupingBy, Collectors.collectingAndThen, sorted, limit

---

**58. Distinct by a property**
Remove duplicate `Person` objects by name (keep first occurrence).
`Tags:` filter with stateful Predicate, ConcurrentHashMap::putIfAbsent

---

**59. Zip two lists**
Combine two lists element-by-element into a list of pairs using `IntStream.range`.
`Tags:` IntStream.range, List::get

---

**60. Running total**
Produce a list where each element is the cumulative sum up to that index.
`Tags:` IntStream, reduce, mapToObj

---

## Level 4 · Upper-Intermediate (Problems 61–75)

> Multi-step pipelines, complex collectors, `Comparator` chains, `teeing`, streams on files/maps

---

**61. Multi-level sort**
Sort employees by department ASC, then salary DESC, then name ASC — handle nulls.
`Tags:` Comparator.comparing, thenComparing, reversed, nullsLast

---

**62. Max by field per group**
For each department, find the employee with the highest salary.
`Tags:` Collectors.groupingBy, Collectors.maxBy

---

**63. Summarize statistics**
Compute count, sum, min, max, and average of a salary list in one pass.
`Tags:` Collectors.summarizingDouble, DoubleSummaryStatistics

---

**64. Collectors.teeing — dual aggregation**
In a single stream pass, compute both the total and the count, then derive the average. (Java 12+)
`Tags:` Collectors.teeing

---

**65. collectingAndThen**
Collect a stream into a list, then wrap it in `Collections.unmodifiableList`.
`Tags:` Collectors.collectingAndThen

---

**66. Stream a Map's entries**
Given a `Map<String, Integer>`, filter entries where value > 10 and collect into a new map.
`Tags:` Map.entrySet().stream(), filter, Collectors.toMap

---

**67. Invert a map**
Given `Map<String, Integer>`, produce `Map<Integer, String>` (assume unique values).
`Tags:` entrySet stream, Collectors.toMap, Map.Entry

---

**68. Stream lines from a file**
Read a text file, filter lines containing a keyword, count them.
`Tags:` Files.lines(), filter, count, try-with-resources

---

**69. Word frequency from file**
Stream all words from a file and compute frequency of each word.
`Tags:` Files.lines, flatMap, split, Collectors.groupingBy, counting

---

**70. Longest word in file**
Find the longest word in a text file using a stream.
`Tags:` Files.lines, flatMap, max, Comparator.comparingInt

---

**71. Stream with index**
Process list elements together with their index (0-based).
`Tags:` IntStream.range, list::get

---

**72. Partition and transform each partition**
Partition a list of integers into positive and negative, then square each element in both partitions.
`Tags:` partitioningBy, mapping, downstream collectors

---

**73. Build a histogram**
Given a list of grades (0–100), count how many fall in each decile bucket (0–9, 10–19, ...).
`Tags:` Collectors.groupingBy with bucket function, counting

---

**74. Chain predicates dynamically**
Build a list of `Predicate<Employee>` at runtime and combine them with `reduce` using `Predicate::and`.
`Tags:` Predicate.and, reduce, dynamic filter chain

---

**75. Peek for debugging**
Insert `peek` at multiple points in a pipeline to trace element flow without changing results.
`Tags:` peek, debugging pipelines

---

## Level 5 · Advanced (Problems 76–90)

> Custom `Collector`, `Spliterator`, parallel streams, infinite streams, performance

---

**76. Custom Collector — running average**
Implement `Collector<Double, ?, Double>` that computes a running average without using built-in summarizing collectors.
`Tags:` Collector.of, supplier, accumulator, combiner, finisher

---

**77. Custom Collector — top N**
Build a `Collector` that retains only the top N elements by a comparator.
`Tags:` Collector.of, PriorityQueue

---

**78. Custom Collector — multimap**
Implement a `Collector` that produces a `Map<K, List<V>>` (like `groupingBy`) from scratch.
`Tags:` Collector.of, Map::computeIfAbsent

---

**79. Parallel prime sieve**
Find all primes up to 1,000,000 using a parallel stream. Compare time with sequential.
`Tags:` parallelStream, IntStream.range, filter

---

**80. Thread-safe parallel collect**
Show why `ArrayList` is unsafe as a parallel collect target. Fix it with the right collector.
`Tags:` parallelStream, Collectors.toList, thread safety

---

**81. Custom ForkJoinPool for parallel stream**
Run a parallel stream in a custom `ForkJoinPool` with a specific parallelism level.
`Tags:` ForkJoinPool.submit, parallelStream

---

**82. Infinite stream of primes**
Generate an infinite stream of prime numbers lazily. Take first 500.
`Tags:` Stream.iterate, filter, limit, lazy evaluation

---

**83. takeWhile and dropWhile**
From a sorted list, take elements while value < 50, then drop the first 5 from the remainder. (Java 9+)
`Tags:` takeWhile, dropWhile

---

**84. Stream.ofNullable**
Safely stream a value that may be null without an `if` check. (Java 9+)
`Tags:` Stream.ofNullable

---

**85. Custom Spliterator — paginated source**
Implement a `Spliterator<T>` over a paginated data source (mock with a list of pages). Support `trySplit` for parallelism.
`Tags:` Spliterator, tryAdvance, trySplit, StreamSupport.stream

---

**86. Spliterator with estimated size**
Implement `estimateSize()` correctly and verify it influences parallel splitting behavior.
`Tags:` Spliterator.estimateSize, characteristics

---

**87. Memoize a stream computation**
Cache the result of an expensive stream pipeline so it is computed only once, even if called multiple times.
`Tags:` Supplier, lazy initialization, collect once

---

**88. Stream pipeline as a value**
Compose a reusable pipeline as a `Function<Stream<T>, Stream<R>>` and apply it to multiple sources.
`Tags:` Function composition, UnaryOperator, Stream pipelines as values

---

**89. Detect pipeline short-circuiting**
Write a test that proves a `map` lambda is never called when `findFirst` short-circuits before it.
`Tags:` lazy evaluation, peek, findFirst, anyMatch

---

**90. Benchmark sequential vs parallel**
Use `System.nanoTime` (or JMH) to benchmark sequential vs parallel stream for: (a) simple sum, (b) complex groupingBy on 5M records. Explain when parallel wins.
`Tags:` parallelStream, benchmarking, ForkJoin overhead

---

## Level 6 · Expert (Problems 91–100)

> Real-world systems, architectural tradeoffs, advanced composition, Java 16–21 features

---

**91. Full ETL pipeline**
Build a stream-based ETL: read CSV lines → parse records → validate → enrich (lookup from a map) → transform → write to output list. Each stage is a composable `Function`.
`Tags:` Function.andThen, UnaryOperator, flatMap, filter, collect

---

**92. Reactive-style error handling**
Implement a pipeline where individual record failures are captured (not thrown), and the result is `Map<Boolean, List<Result>>` — successes and failures — processed in a single pass.
`Tags:` Collectors.partitioningBy, try-catch inside map, Either pattern

---

**93. E-commerce analytics**
Given 100k orders with line items: compute (a) top 10 products by revenue, (b) monthly revenue trend, (c) average order value by customer tier, (d) customers with declining purchase frequency. All in streams.
`Tags:` flatMap, groupingBy, teeing, sorted, limit, Collectors.summarizingDouble

---

**94. Graph traversal with streams**
Implement BFS over an adjacency-list graph using `Stream.iterate` with a queue state object. Return shortest path length.
`Tags:` Stream.iterate, takeWhile, stateful objects in streams

---

**95. Implement your own Stream.zip**
Java has no built-in `zip`. Implement a static `<A,B,C> Stream<C> zip(Stream<A>, Stream<B>, BiFunction<A,B,C>)` using `Spliterator`.
`Tags:` Spliterator, StreamSupport.stream, BiFunction

---

**96. Windowed stream**
Produce a stream of sliding windows of size N over a list. For example, `[1,2,3,4,5]` with window 3 → `[[1,2,3],[2,3,4],[3,4,5]]`.
`Tags:` IntStream.range, subList, collect

---

**97. Parallel stream with custom collector — histogram**
Build a thread-safe histogram collector that works correctly under `parallelStream`. Verify the combiner merges correctly.
`Tags:` Collector.of, CONCURRENT characteristic, ConcurrentHashMap, combiner

---

**98. Stream vs loop — tradeoff analysis**
For each of these cases, decide and justify: stream or loop? (a) mutating shared state, (b) early exit with exception, (c) complex interdependent loop variables, (d) simple transformation of large list.
`Tags:` design judgment, readability vs performance

---

**99. Compose a multi-tenant data pipeline**
Given streams from multiple tenants, tag each record with its tenant, merge, process uniformly, then split back by tenant into separate result maps.
`Tags:` flatMap, map (tag), groupingBy, downstream collect

---

**100. Build a mini query DSL**
Design a fluent builder — `Query.from(list).where(predicate).orderBy(comparator).limit(n).select(mapper)` — backed entirely by streams internally.
`Tags:` Builder pattern, lazy stream construction, terminal execution, Function/Predicate composition

---

## Quick Reference — Problem Index by Topic

| Topic | Problem Numbers |
|-------|----------------|
| forEach, filter, map, count | 1–10 |
| Sorting, limiting, skipping | 14–18 |
| Primitive streams (IntStream etc.) | 7, 21, 36–37 |
| Collectors: toList, toSet, joining | 6, 20, 22, 29–30 |
| flatMap | 41–42, 54–55 |
| groupingBy | 43–46, 56–57, 62 |
| partitioningBy | 47–48, 72 |
| reduce | 51–53 |
| toMap | 49–50, 67 |
| Optional | 54–55, 84 |
| Comparator chains | 61 |
| Collectors.teeing | 64 |
| File streams | 68–70 |
| Custom Collector | 76–78, 97 |
| Parallel streams | 28, 79–81, 90 |
| Spliterator | 85–86, 95 |
| Infinite streams | 17, 37, 82 |
| Java 9+ (takeWhile, dropWhile, ofNullable) | 83–84 |
| Performance & benchmarking | 88–90 |
| Real-world pipelines | 91–94, 99 |
| Design & DSL | 98, 100 |

---

## Skill Progression Summary

| Level | Problems | Time Estimate |
|-------|----------|--------------|
| Beginner | 1–20 | 1 day |
| Elementary | 21–40 | 1–2 days |
| Intermediate | 41–60 | 3–5 days |
| Upper-Intermediate | 61–75 | 1 week |
| Advanced | 76–90 | 1–2 weeks |
| Expert | 91–100 | 2–4 weeks |
