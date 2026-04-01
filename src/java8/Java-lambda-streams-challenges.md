Here are 20 Java Stream API challenges based on your employee data, ranging from beginner to advanced:Click any task to mark it complete. Here's the progression logic:

**Beginner** tasks focus on the core pipeline: `filter`, `map`, `collect`, `sorted`, `count` — the building blocks you need to know cold.

**Intermediate** tasks introduce aggregation: `groupingBy`, `partitioningBy`, `joining`, `max`, `min`, `anyMatch`, `limit`. These are where streams really earn their keep over loops.

**Advanced** tasks chain multiple collectors, use `summaryStatistics`, transform objects mid-stream, and touch `reduce` directly — closer to real-world production code patterns.

A few to pay special attention to:
- **#10** (department with highest total salary) is a great exercise in chaining a stream *on top of* a collector result
- **#17** (applying raises) reinforces that streams don't mutate — you always return new objects
- **#20** (using `reduce` directly) demystifies what collectors are doing under the hood

Want me to reveal a solution for any specific task?


# Java Lambda & Stream API — Challenges Roadmap

A structured set of 25 hands-on challenges to take you from syntax familiarity to expert-level mastery. Each tier builds on the last — work through them in order.

---

## Tier 1 · Naive — Getting Your Footing

> Focus: Syntax, functional interfaces, basic method references

### Challenge 1 — Lambda Basics

**Task:** Rewrite 5 anonymous `Runnable`, `Comparator`, and `ActionListener` instances as lambdas. Notice what changes and what stays the same.

**Key APIs:** `Runnable`, `Comparator`, `Consumer`, `Supplier`, `Function`

**Starter hint:**
```java
Runnable r = () -> System.out.println("hello");
Comparator<String> c = (a, b) -> a.compareTo(b);
```

---

### Challenge 2 — Functional Interfaces

**Task:** Create a custom `Transformer<T,R>` functional interface. Use it to transform a list of strings to integers, and to uppercase.

**Key APIs:** `@FunctionalInterface`, `Function<T,R>`, `apply()`

**Starter hint:**
```java
@FunctionalInterface
interface Transformer<T, R> {
    R transform(T input);
}
```

---

### Challenge 3 — Method References

**Task:** Replace lambdas with method references — cover all 4 kinds: static method, instance method (unbound), instance method (bound), and constructor reference.

**Key APIs:** `Class::staticMethod`, `obj::method`, `Class::method`, `Class::new`

**Starter hint:**
```java
list.forEach(System.out::println);       // bound instance
list.stream().map(String::toUpperCase);  // unbound
```

---

### Challenge 4 — Predicate Chaining

**Task:** Given a list of integers, filter those that are `> 10` AND even, OR negative. Build this using `Predicate` composition — no inline &&/|| operators.

**Key APIs:** `Predicate.and()`, `.or()`, `.negate()`, `.not()`

**Starter hint:**
```java
Predicate<Integer> gt10 = n -> n > 10;
Predicate<Integer> even = n -> n % 2 == 0;
list.stream().filter(gt10.and(even));
```

---

### Challenge 5 — Function Composition

**Task:** Build a pipeline: trim a string → convert to int → square it → convert back to string. Use `Function.andThen` only.

**Key APIs:** `Function.andThen()`, `Function.compose()`, `Function.identity()`

**Starter hint:**
```java
Function<String, String> trimmed = String::trim;
Function<String, Integer> toInt   = Integer::parseInt;
Function<String, Integer> pipeline = trimmed.andThen(toInt);
```

---

## Tier 2 · Beginner — Core Stream Operations

> Focus: `filter`, `map`, `sorted`, `collect`, `forEach`

### Challenge 6 — Filter and Collect

**Task:** From a list of employees, collect names of those earning > 80k, sorted alphabetically, into a `List<String>`.

**Key APIs:** `stream()`, `filter()`, `map()`, `sorted()`, `collect(Collectors.toList())`

**Starter hint:**
```java
employees.stream()
    .filter(e -> e.salary() > 80_000)
    .map(Employee::name)
    .sorted()
    .collect(Collectors.toList());
```

---

### Challenge 7 — Transformation Pipeline

**Task:** Given a list of CSV strings `"name,age,city"`, parse each into a record object and collect only adults (age >= 18) from a given city.

**Key APIs:** `map()`, `filter()`, `collect()`, record classes

**Starter hint:**
```java
Stream.of(lines)
    .map(line -> line.split(","))
    .map(p -> new Person(p[0], Integer.parseInt(p[1]), p[2]))
    .filter(p -> p.age() >= 18);
```

---

### Challenge 8 — Numeric Streams

**Task:** Compute sum, average, min, max of a list of doubles without loops. Also generate the first 20 Fibonacci numbers using `Stream.iterate`.

**Key APIs:** `IntStream.range()`, `DoubleStream`, `mapToInt()`, `sum()`, `average()`, `Stream.iterate()`

**Starter hint:**
```java
IntStream.rangeClosed(1, 100).sum();

Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
    .limit(20)
    .map(f -> f[0]);
```

---

### Challenge 9 — Distinct and Dedup

**Task:** From a list of orders, find all unique product categories purchased. Then find categories bought more than once.

**Key APIs:** `distinct()`, `groupingBy()`, `counting()`, `filter()` on entry set

**Starter hint:**
```java
orders.stream()
    .map(Order::category)
    .distinct()
    .collect(Collectors.toList());
```

---

### Challenge 10 — Short-Circuit Operations

**Task:** Given a large list of users, check: any admin? All verified? Find first inactive. Time each operation — understand lazy evaluation in practice.

**Key APIs:** `anyMatch()`, `allMatch()`, `noneMatch()`, `findFirst()`, `findAny()`

**Starter hint:**
```java
boolean hasAdmin = users.stream().anyMatch(User::isAdmin);
Optional<User> first = users.stream()
    .filter(u -> !u.active())
    .findFirst();
```

---

## Tier 3 · Intermediate — Collectors and Reduction

> Focus: `groupingBy`, partitioning, `flatMap`, `reduce`, `Optional`

### Challenge 11 — groupingBy Mastery

**Task:** Group a list of transactions by month, then by category within each month. Compute total amount per group.

**Key APIs:** `Collectors.groupingBy()`, downstream collectors, `Collectors.summingDouble()`

**Starter hint:**
```java
transactions.stream().collect(
    Collectors.groupingBy(Transaction::month,
        Collectors.groupingBy(Transaction::category,
            Collectors.summingDouble(Transaction::amount))));
```

---

### Challenge 12 — Partitioning

**Task:** Partition a list of students into pass/fail (score >= 50). Within each partition, find the top scorer.

**Key APIs:** `Collectors.partitioningBy()`, downstream collectors, `maxBy()`

**Starter hint:**
```java
Collectors.partitioningBy(s -> s.score() >= 50,
    Collectors.maxBy(Comparator.comparingInt(Student::score)));
```

---

### Challenge 13 — flatMap Exploration

**Task:** Given a list of `Order`s each containing a list of `Item`s, produce a flat list of all item names. Then find all distinct items purchased by any user.

**Key APIs:** `flatMap()`, `Stream.of()`, `Collection::stream`

**Starter hint:**
```java
orders.stream()
    .flatMap(o -> o.items().stream())
    .map(Item::name)
    .distinct()
    .collect(Collectors.toList());
```

---

### Challenge 14 — Reduce and Fold

**Task:** Using only `reduce` (no sum/count helpers): compute the product of a list, concatenate strings with a separator, and build a frequency map.

**Key APIs:** `reduce(identity, accumulator)`, `reduce(accumulator)` → `Optional`

**Starter hint:**
```java
int product = list.stream().reduce(1, (a, b) -> a * b);

String joined = list.stream()
    .reduce("", (a, b) -> a.isEmpty() ? b : a + "," + b);
```

---

### Challenge 15 — Optional Chains

**Task:** From a config map, safely extract a nested optional value: map → key → parse int → validate range → return default. No null checks allowed.

**Key APIs:** `Optional.ofNullable()`, `map()`, `flatMap()`, `filter()`, `orElse()`, `orElseThrow()`

**Starter hint:**
```java
Optional.ofNullable(config.get("timeout"))
    .map(Integer::parseInt)
    .filter(n -> n > 0 && n < 300)
    .orElse(30);
```

---

### Challenge 16 — joining and toMap

**Task:** Build a comma-separated string of sorted names. Build a `Map<id, name>` from a list — handle duplicate keys gracefully with a merge function.

**Key APIs:** `Collectors.joining()`, `Collectors.toMap()`, merge function

**Starter hint:**
```java
Collectors.joining(", ", "[", "]")

// toMap with merge:
Collectors.toMap(User::id, User::name, (a, b) -> a + "|" + b);
```

---

## Tier 4 · Advanced — Composition and Custom Collectors

> Focus: Custom `Collector`, parallel streams, infinite streams, `Comparator` chains

### Challenge 17 — Custom Collector

**Task:** Write a `Collector` that collects elements into a running-average holder, returning the final average. Implement all parts: supplier, accumulator, combiner, finisher.

**Key APIs:** `Collector.of()`, supplier, accumulator, combiner, finisher, `Characteristics`

**Starter hint:**
```java
Collector.of(
    () -> new double[]{0, 0},             // [sum, count]
    (a, e) -> { a[0] += e; a[1]++; },
    (a, b) -> new double[]{a[0]+b[0], a[1]+b[1]},
    a -> a[1] == 0 ? 0 : a[0] / a[1]);
```

---

### Challenge 18 — Parallel Stream Pitfalls

**Task:** Parallelize a CPU-bound task (compute `isPrime` for 1M numbers). Then intentionally write an unsafe shared-state parallel stream — observe the bug — then fix it.

**Key APIs:** `parallelStream()`, `Collectors.toConcurrentMap()`, `ForkJoinPool`

**Starter hint:**
```java
// Safe
list.parallelStream().filter(Primes::isPrime).collect(Collectors.toList());

// Unsafe — never do this:
List<X> result = new ArrayList<>();
stream.parallel().forEach(result::add); // race condition
```

---

### Challenge 19 — Infinite Streams

**Task:** Generate prime numbers lazily using `Stream.iterate` + `filter`. Take first 1000. Also use `takeWhile` and `dropWhile` (Java 9+) on a bounded stream.

**Key APIs:** `Stream.iterate()`, `Stream.generate()`, `limit()`, `takeWhile()`, `dropWhile()`

**Starter hint:**
```java
Stream.iterate(2, n -> n + 1)
    .filter(Primes::isPrime)
    .limit(1000)
    .collect(Collectors.toList());
```

---

### Challenge 20 — Comparator Chains

**Task:** Sort employees by department ASC, then salary DESC, then name ASC. Handle nulls safely using `nullsFirst` / `nullsLast`.

**Key APIs:** `Comparator.comparing()`, `thenComparing()`, `reversed()`, `nullsFirst()`, `nullsLast()`

**Starter hint:**
```java
Comparator.comparing(Employee::dept)
    .thenComparing(Comparator.comparingDouble(Employee::salary).reversed())
    .thenComparing(Employee::name);
```

---

### Challenge 21 — Spliterator

**Task:** Implement a `Spliterator` over a paginated REST API (mock it). Allow `trySplit` so callers can parallelize page fetching.

**Key APIs:** `Spliterator<T>`, `tryAdvance()`, `trySplit()`, `estimateSize()`, `characteristics()`

**Starter hint:**
```java
class PageSpliterator implements Spliterator<Item> {
    public boolean tryAdvance(Consumer<? super Item> action) { ... }
    public Spliterator<Item> trySplit() { ... }
}
```

---

## Tier 5 · Expert — Real-World Mastery

> Focus: Reactive-style pipelines, performance tuning, stream vs loop tradeoffs

### Challenge 22 — Pipeline Refactor

**Task:** Take a 200-line imperative report generator (nested loops, mutable accumulators, if-else chains) and refactor it entirely to a stream pipeline. Preserve semantics exactly.

**Key APIs:** All of the above combined

**Starter hint:**
```java
// Before: for loop with map.put, if checks, nested for
// After:
stream().collect(groupingBy(..., mapping(..., toSet())))
```

---

### Challenge 23 — Performance Profiling

**Task:** For 10M elements, compare loop, sequential stream, and parallel stream for: sum, filter+map, and `groupingBy`. Use JMH or `System.nanoTime`. Explain your results.

**Key APIs:** `parallelStream()`, JMH `@Benchmark`, `IntStream`

**Key insight:**
```
Parallel is not always faster.
Fork/join overhead beats gains for simple ops on small data.
Use IntStream.range for primitive-heavy work to avoid boxing.
```

---

### Challenge 24 — Lazy Evaluation Chain

**Task:** Model a data pipeline (load → parse → validate → enrich → export) where each step is a `Function` or `UnaryOperator`. Compose them and add timing/logging transparently as decorators.

**Key APIs:** `Function.andThen()`, `UnaryOperator`, `Function.identity()`

**Starter hint:**
```java
UnaryOperator<Stream<Record>> pipeline =
    loadStep.andThen(parseStep).andThen(validateStep).andThen(enrichStep);

// Wrap each step with a timing decorator
```

---

### Challenge 25 — Domain Modelling (Capstone)

**Task:** E-commerce order analytics. Given 100k orders with line items, compute using streams:
- Top 10 products by revenue
- Monthly revenue trend
- Average order value by customer tier
- Customers with declining order frequency

**Key APIs:** Everything — `groupingBy`, `flatMap`, `reduce`, `Collectors.teeing()`, `sorted`, `limit`

**Starter hint:**
```java
// Collectors.teeing (Java 12+) for dual aggregation in one pass:
Collectors.teeing(
    Collectors.summingDouble(Order::total),
    Collectors.counting(),
    (sum, count) -> sum / count);
```

---

## Progression Guide

| Tier | Suggested Time | Focus |
|------|---------------|-------|
| Tier 1 — Naive | Half a day | Syntax muscle memory |
| Tier 2 — Beginner | Half a day | Core verbs, lazy eval |
| Tier 3 — Intermediate | 2–3 days | groupingBy, flatMap (biggest skill jump) |
| Tier 4 — Advanced | 3–4 days | Custom Collector, parallel pitfalls |
| Tier 5 — Expert | 1 week+ | Perf reasoning, real codebases |

> **Tip:** Implementing `Collector` from scratch (Challenge 17) is the single best exercise for deeply understanding what stream terminal operations are actually doing under the hood.
