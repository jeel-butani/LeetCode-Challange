class NestedIterator {
public:
    stack<NestedInteger> s;
    NestedIterator(vector<NestedInteger> &nestedList) {
        for (int i = nestedList.size() - 1; i >= 0; i--) {
            s.push(nestedList[i]);
        }
    }
    
    int next() {
        int result = s.top().getInteger();
        s.pop();
        return result;
    }
    
    bool hasNext() {
        while (!s.empty()) {
            if (s.top().isInteger()) {
                return true;
            }
            vector<NestedInteger> nestedList = s.top().getList();
            s.pop();
            for (int i = nestedList.size() - 1; i >= 0; i--) {
                s.push(nestedList[i]);
            }
        }
        return false;
    }
};
