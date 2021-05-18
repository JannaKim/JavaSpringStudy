/*
부모 클래스의 메소드가 자식 클래스에서 사용하기 부적합할 경우, 자식 클래스에서 수정해서 사용할 수 있다.

재정의 했는데 부모 메소드 호출해야 하는 경우는?
super.method(); 해준다.

final 클래스란?
상속할 수 없는 클래스.

final 메소드?
재정의 할 수 없는 메소드.

자식클래스에서 오버라이딩 했을 때 final 새로 붙이는 건 될까? 됨.
*/

static class Node implements Comparable<Node> {
    private int idx, time, priority; //PS 오버라이딩 예시: compare to key

    public Node(int idx, int time, int priority) {
        this.idx = idx;
        this.time = time;
        this.priority = priority;
    }

    public void aging() {
        this.time = this.time+1;
    }

    @Override // 재정의. 정렬 순서 바꿔줘야 해서.
    public int compareTo(Node o2) {
        {
            if (time == o2.time) {
                if (o2.priority == priority)
                    return idx - o2.idx;
                return priority - o2.priority;
            }
            return time - o2.time;
        }
    }
}

public static int[] solution(int[] t, int[] r) {
    int[] answer = new int[t.length];
    ArrayList<Integer> list = new ArrayList<>();
    PriorityQueue<Node> jobQ = new PriorityQueue<>(new Comparator<Node>() {
        @Override
        public int compare(Node o1, Node o2) {
            if (o1.priority - o2.priority == 0) {
                if (o1.time == o2.time)
                    return o1.idx - o2.idx;
                return o1.time - o2.time;
            }
            return o1.priority - o2.priority;
        }
    });
    PriorityQueue<Node> readyQ = new PriorityQueue<>(new Comparator<Node>() {
        @Override
        public int compare(Node o1, Node o2) {
            if (o1.time - o2.time == 0) {
                if (o1.priority == o2.priority)
                    return o1.idx - o2.idx;
                return o1.priority - o2.priority;
            }
            return o1.time - o2.time;
        }
    });
    for (int i = 0; i < t.length; i++) {
        readyQ.offer(new Node(i, t[i], r[i]));
    }
    int time = 0;
    while (list.size() != t.length) {
            while (!readyQ.isEmpty() && readyQ.peek().time == time) {
                jobQ.offer(readyQ.poll());
            }
            if (!jobQ.isEmpty()) {
                list.add(jobQ.poll().idx);
                for (int j = 0; j < jobQ.size(); j++) {
                    Node cur = jobQ.poll();
                    cur.aging();
                    readyQ.offer(cur);
                }
            }
        time++;
    }
    // System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
        answer[i] = list.get(i);
    }
    return answer;
}