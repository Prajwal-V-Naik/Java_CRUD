class HashSetImplementation {
    public Set<Integer> unionOfElements(Set<Integer> s1, Set<Integer> s2) {
        s1.addAll(s2);
        return s1;
    }
    public Set<Integer> subtractionOfElements(Set<Integer> s1, Set<Integer> s2) {
        s1.removeAll(s2);
        return s1;
    }
    public Set<Integer> intersectionOfElements(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        return intersection;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        Set<Integer> s1 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            s1.add(scanner.nextInt());
        }

        int n2 = scanner.nextInt();
        Set<Integer> s2 = new HashSet<>();
        for (int i = 0; i < n2; i++) {
            s2.add(scanner.nextInt());
        }

        HashSetImplementation hsi = new HashSetImplementation();
        Set<Integer> union = hsi.unionOfElements(s1, s2);
        Set<Integer> difference = hsi.subtractionOfElements(s1, s2);
        Set<Integer> intersection = hsi.intersectionOfElements(s1, s2);
        System.out.println("Union: " + union);
        System.out.println("Difference: " + difference);
        System.out.println("Intersection: " + intersection);
    }
}
