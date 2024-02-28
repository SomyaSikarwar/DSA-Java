#include <iostream>
using namespace std;

struct Node{
    int name;
    int value;
};

struct edge{
    int source;
    int destination;
    int heuristic;
};


void graph(int edge ,int vertex){
    struct Node n[vertex];
    struct edge e[edge];
    
    for(int i = 0 ; i < vertex ;i++){
        cout<<"Name of node: ";
        cin>>n[i].name;
        
        cout<<"Value of node: ";
        cin>>n[i].value;
    }
    
    for(int i = 0 ; i < edge ;i++){
        cout<<"Source of "<<i+1;
        cin>>e[i].source;
        
        cout<<"Destination of"<<i+1;
        cin>>e[i].destination;
        
        cout<<"Heuristic value of "<<i+1;
        cin>>e[i].heuristic;
    }
    
}

void astar(int start , int end){
    
}

int main(){
    
    int edges ,vertex;
    
    cout<<"Enter the number of vertices: ";
    cin>>vertex;
    
    cout<<"Enter the number of edges: ";
    cin>>edges;
    graph(edges,vertex);
    
    return 0;
}
