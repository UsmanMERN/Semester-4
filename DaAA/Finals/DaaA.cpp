#include <iostream>

using namespace std;

int *zip(const int *table1, const int *table2, int size)
{
    int *zippedTable = new int[size];

    for (int i = 0; i < size; i++)
    {
        if (table1[i] == 1 && table2[i] == 2)
        {
            zippedTable[i] = 1;
        }
        else
        {
            zippedTable[i] = 0;
        }
    }

    return zippedTable;
}

void displayTable(const int *table, int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << table[i] << " ";
    }
    cout << endl;
}

pair<int *, int *> unzip(const int *zippedTable, int size)
{
    int *table1 = new int[size];
    int *table2 = new int[size];

    for (int i = 0; i < size; i++)
    {
        if (zippedTable[i] == 1)
        {
            table1[i] = 1;
            table2[i] = 2;
        }
        else
        {
            table1[i] = 0;
            table2[i] = 0;
        }
    }

    return make_pair(table1, table2);
}

int main()
{
    int table1[] = {1, 0, 1, 1, 0};
    int table2[] = {0, 2, 2, 1, 2};
    int size = sizeof(table1) / sizeof(table1[0]);

    // Zip the tables
    int *zipped = zip(table1, table2, size);

    // Display zipped table
    cout << "Zipped Table: ";
    displayTable(zipped, size);

    // Unzip the table
    pair<int *, int *> unzipped = unzip(zipped, size);

    // Display table 1
    cout << "Unzipped Table 1: ";
    displayTable(unzipped.first, size);

    // Display table 2
    cout << "Unzipped Table 2: ";
    displayTable(unzipped.second, size);

    // Clean up memory
    delete[] zipped;
    delete[] unzipped.first;
    delete[] unzipped.second;

    return 0;
}