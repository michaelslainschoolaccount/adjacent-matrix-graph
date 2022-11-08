# Adjacent Matrix Graph

## Info

Author: Michael Slain
Acknowledgements: Mr. Kuszmaul

## Documentation

### Node

-   _constructor_
    -   **input:** A number
    -   **output:** nothing
    -   **effect:** Sets the id of the node to the number provided
-   getId
    -   **input:** nothin
    -   **output:** the id of the node
    -   **effect:** gets the id of the node
-   toString
    -   **input:** nothing
    -   **output:** nothing
    -   **effect:** Prints the id of the node

### Edge

-   _constructor_
    -   **input:** Starting node, ending node
    -   **output:** nothing
    -   **effect:** Sets it's starting and ending node to the nodes provided
-   getStart
    -   **input:** nothing
    -   **output:** A node
    -   **effect:** Gets the start node
-   getEnd
    -   **input:** nothing
    -   **output:** A node
    -   **effect:** Gets the end node of the edge
-   setStart
    -   **input:** A node
    -   **output:** nothing
    -   **effect:** Sets the start node of the edge
-   setEnd
    -   **input:** A node
    -   **output:** nothing
    -   **effect:** Sets the end node of the edge
-   toString
    -   **input:** nothing
    -   **output:** nothing
    -   **effect:** Prints the start and end node of the edge

### Graph

-   _constructor_
    -   **input:** A set of edges, a set of nodes
    -   **output:** nothing
    -   **effect:** Creates adjacency matrix and set of nodes
-   getAdjacent
    -   **input:** A node
    -   **output:** A set of nodes
    -   **effect:** Returns the nodes adjacent to the provided node (adjacent meaning a node connected to that node)
