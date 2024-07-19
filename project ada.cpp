#include <iostream>
#include <vector>
#include <iomanip>

using namespace std;

// Function to check if placing a character in a cell is valid
bool isValid(vector<vector<char>> &board, int row, int col, char c) {
    for (int i = 0; i < 9; i++) {
        if (board[i][col] == c) return false;
        if (board[row][i] == c) return false;
        if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
    }
    return true;
}

// Function to solve the Sudoku puzzle
bool solveSudoku(vector<vector<char>> &board) {
    for (int i = 0; i < board.size(); i++) {
        for (int j = 0; j < board[0].size(); j++) {
            if (board[i][j] == '.') {
                for (char c = '1'; c <= '9'; c++) {
                    if (isValid(board, i, j, c)) {
                        board[i][j] = c;
                        if (solveSudoku(board)) return true;
                        else board[i][j] = '.';
                    }
                }
                return false;
            }
        }
    }
    return true;
}

// Function to print a separator line
void printSeparator(int cols) {
    for (int i = 0; i < cols; ++i) {
        cout << "+-----";
    }
    cout << "+" << endl;
}

// Main function
int main() {
    vector<vector<char>> board{
        {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
        {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
        {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
        {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
        {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
        {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
        {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
        {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
        {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
    };

    // Solve the Sudoku puzzle
    solveSudoku(board);

    // Print the solved Sudoku board with separators
    int rows = board.size();
    int cols = board[0].size();
    printSeparator(cols);
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cout << "| " << setw(3) << board[i][j] << " "; // Print cell with | separator
        }
        cout << "|" << endl; // End of the row
        printSeparator(cols); // Print the row separator
    }

    return 0;
}