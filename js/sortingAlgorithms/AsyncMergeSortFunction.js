async function MergeSort(array) {
  if (array.length > 1) {
    const middle = Math.round(array.length / 2);

    const left = array.slice(0, middle);
    const right = array.slice(middle);
    const leftResult = await MergeSort(left);
    const rightResult = await MergeSort(right);
    const result = await merge(leftResult, rightResult);
    return result;
  } else {
    return array;
  }
}

async function merge(left, right) {
  let i = 0;
  let j = 0;
  let array = [];
  let amountNew = 0;
  while (i < left.length || j < right.length) {
    if (i === left.length) {
      array.push(right[j]);
      j++;
    } else if (j === right.length || left[i] <= right[j]) {
      array.push(left[i]);
      i++;      
    } else {
      array.push(right[j]);
      j++;
    }
  }

  return array;
}
